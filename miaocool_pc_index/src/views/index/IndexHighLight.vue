<template>
  <div>
    <SectionTitle title="喵酷建站亮点" eng-title="HIGHLIGHTS"/>
    <div class="container body row">
      <div class="card row" v-for="item in metaData">
        <div class="img">
          <img :src="item.iconUrl" alt="">
        </div>
        <div class="text col">
          <div class="title">{{item.title}}</div>
          <div class="content">{{item.content}}</div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import SectionTitle from "@/views/index/components/SectionTitle"
import {indexHighLightApi, indexTypeApi} from "@/api/index"
export default {
name: "IndexHighLight",
  components: {SectionTitle},
  data() {
    return {
      metaData: []
    }
  },
  created() {
    indexHighLightApi.getAll().then(ret=>{
      this.metaData = ret.data
    })
  }
}
</script>

<style scoped lang="scss">
  .body{
    padding-bottom: 40px;
  }
  .card{
    cursor: pointer;
    height: 123px;
    width: 386px;
    transition: all 0.2s;
    position: relative;
    top: 0;
    margin-bottom: 40px;
    &:hover{
      top: -6px;
      box-shadow: 0px 10px 20px 0px rgba(0, 0, 0, 0.05);
    }
    .img{
      margin-left: 25px;
      img{
        width: 52px;
        height: 52px;
      }
    }
    .text{
      padding: 0 26px;
      flex: 1;
      align-items: flex-start;
      .title{
        height: 25px;
        font-size: 18px;
        font-family: PingFangSC-Semibold, PingFang SC;
        font-weight: 600;
        color: #222222;
        line-height: 25px;}
      .content{
        height: 40px;
        font-size: 14px;
        font-family: PingFangSC-Regular, PingFang SC;
        font-weight: 400;
        color: #767676;
        line-height: 20px;
      }
    }
  }
</style>
