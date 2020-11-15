<template>
  <div style="background-color:#242b33; padding-top: 1px">
    <SectionTitle title="常见网站类型" eng-title="TYPE" eng-title-color="white" title-color="white"/>
    <div class="container row itemWrapper">
      <div class="item col" v-for="item in metaData">
        <div class="image">
          <img :src="item.iconUrl" alt="">
        </div>
        <div class="title">{{item.title}}</div>
        <div class="subtitle">{{item.subtitle}}</div>
      </div>
    </div>
    <div class="bottom row ">
      <div class="container row">
        <span>喵酷为您免费设计专属建站方案</span>
        <div class="btn">立即咨询</div>
      </div>

    </div>
  </div>
</template>

<script>
import SectionTitle from "@/views/index/components/SectionTitle"
import {indexTypeApi} from "@/api/index"

export default {
  name: "IndexType",
  components: {SectionTitle},
  data() {
    return {
      metaData: []
    }
  },
  created() {
    indexTypeApi.getAll().then(ret => {
      this.metaData = ret.data
    })
  }
}
</script>

<style scoped lang="scss">
.item {
  padding: 0 24px;
  width: 285px;
  margin-bottom: 40px;

  .image {
    width: 72px;
    height: 72px;
    margin: 24px 0;
  }

  .title {
    height: 28px;
    font-size: 20px;
    font-family: PingFangSC-Semibold, PingFang SC;
    font-weight: 600;
    color: #FFFFFF;
    line-height: 28px;
    margin-bottom: 16px;
  }

  .subtitle {
    text-align: center;
    height: 40px;
    font-size: 14px;
    font-family: PingFangSC-Regular, PingFang SC;
    font-weight: 400;
    color: #FFFFFF;
    line-height: 20px;
  }
}
.bottom{
  background-color: #00152C;
  height: 112px;
  span{
    height: 33px;
    font-size: 24px;
    font-weight: 400;
    color: #FFFFFF;
    line-height: 33px;
    margin: 0 240px;
  }
}
</style>
