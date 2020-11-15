<template>
  <div>
    <SectionTitle title="合作案例" eng-title="CASE" title-color="#222222" eng-title-color="#767676"/>

    <div class="navArea container row">
      <div class="nav-btn"
           :class="{active: index===activeIndex}"
           @click="handleClick(index)"
           v-for="(item,index) in metaData">
        {{ item.title }}
      </div>
    </div>
    <div class="body row container" v-if="metaData.length">
      <div class="mac" style="background:url('http://47.95.192.129:3333/2020-11-15/编组 10.png')" >
        <!--<img src="" alt="">-->
        <div class="inner" ref="mac">
          <div class="inner-item" v-for="item in metaData">
            <img :src="item.image" class="moveImg" @mouseenter="handleImgMove" @mouseleave="handleImgBack">
          </div>
        </div>
      </div>
      <div class="text col">
        <div class="title">{{metaData[activeIndex].subTitle}}</div>
        <div class="content">{{metaData[activeIndex].content}}</div>
        <div class="button">{{metaData[activeIndex].button}}</div>
      </div>
    </div>
  </div>
</template>

<script>
import SectionTitle from "@/views/index/components/SectionTitle"
import {indexCaseApi} from "@/api/index"

export default {
  name: "IndexCase",
  components: {SectionTitle},
  data() {
    return {
      metaData: [],
      activeIndex: 0,
      timer: null,
    }
  },
  created() {
    indexCaseApi.getAll().then(ret => {
      this.metaData = ret.data
    })
  },
  methods:{
    handleClick(index){
      this.activeIndex = index
      this.$refs.mac.scrollTo({
        top: 310 * index,
        behavior: "smooth",
      })
    },
    handleImgMove(e) {
      let img = e.target
      let maxHeight = img.scrollHeight
      let interval = maxHeight / 300
      img.style.transitionDuration = interval + "s"
      img.style.top = maxHeight * -1 + 310 + "px"
    },
    handleImgBack(e){
      e.target.style.top = 0
    }
  }
}
</script>

<style scoped lang="scss">
.navArea {
  justify-content: center;
  margin-bottom: 60px;
  .nav-btn {
    width: 191px;
    height: 52px;
    line-height: 52px;
    background: #FFFFFF;
    border: 1px solid #979797;
    font-size: 18px;
    color: #444444;
    text-align: center;
    cursor: pointer;
    transition: all 0.2s;
    margin: 0 20px;
  }
  .active{
    background-color: #3783FF;
    color: #FFFFFF;
  }
}
.body{
  .mac{
    width: 596px;
    height: 479px;
    padding: 24px 24px 145px;
    .inner{
      width: 100%;
      height: 100%;
      background-color: black;
      overflow: hidden;
    }
    .inner-item{
      width: 100%;
      height: 100%;
    }
  }
  .text{
    align-items: flex-start;
    justify-content: flex-start;
    padding: 20px 75px;
    flex: 1;
    height: 479px;
    .title{
      font-size: 22px;
      font-weight: 600;
      color: #444444;
      line-height: 30px;
      margin-bottom: 24px;
    }
    .content{
      font-size: 16px;
      font-weight: 400;
      color: #444444;
      line-height: 28px;
      margin-bottom: 100px;
    }
    .button{
      cursor: pointer;
      width: 191px;
      height: 52px;
      background: #3783FF;
      line-height: 52px;
      text-align: center;
      color: white;
    }
  }
}
.moveImg{
  position: relative;
  top: 0;
  transition: all 5s linear;
}
</style>
