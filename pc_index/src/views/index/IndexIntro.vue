<template>
  <div class="index-introduce container">
    <div class="text col">
      <span>喵酷网络科技有限公司是一家什么什么什么我</span>
      <span>喵酷网络科技有限公司是一家什么什么什</span>
    </div>
    <div class="box-wrapper row">
      <div class="box" >
        <div class="label" :class="{clip: ani1}">P</div>
        <div class="text-area col" :class="{toLeft: ani1}">
          <div class="rich-text" >
            <span class="title">专业平台</span>
            <span class="word">/Professional</span>
          </div>
          <div class="abc">专业的平台为您提供专业的定制方案</div>
        </div>
      </div>
      <div class="box">
        <div class="box">
          <div class="label" :class="{clip: ani1}">A</div>
          <div class="text-area col" :class="{toRight: ani1}">
            <div class="rich-text" >
              <span class="title">完美售后</span>
              <span class="word">/After-sales</span>
            </div>
            <div class="abc">专业的平台为您提供专业的定制方案</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "IndexIntro",
  data() {
    return {
      top: null
    }
  },
  computed:{
    ani1() {
      if(!this.top)
        return false
      if(this.$store.state.scroll.y + window.innerHeight>this.top)
        return true
    },
    ani2() {

    }
  },
  mounted() {
    this.calcRect(document.querySelector(".box"))
  },
  methods:{
    calcRect(el) {
      this.top = el.getBoundingClientRect().bottom
    }
  }
}
</script>

<style scoped lang="scss">
.index-introduce{
  overflow-x: hidden;
}
.text {
  height: 222px;
  font-size: 22px;
  color: #444;
  padding: 80px 0 60px;
  justify-content: space-between;
}

.box-wrapper {
  justify-content: space-between;

  .box {
    height: 220px;
    width: 590px;
    background: #F7F8FA;
    position: relative;

    .label {
      color: #3783FF;
      position: absolute;
      left: 83px;
      font-size: 40px;
      top: 90px;

    }

    .text-area {
      position: absolute;
      justify-content: space-between;
      height: 72px;
      left: 139px;
      top: 50%;
      transform: translateY(-50%);

      .rich-text {
        width: 100%;
        .title {
          font-size: 20px;
          font-weight: 600;
          color: #222222;
          margin-right: 5px;
        }

        .word {
          font-size: 20px;
          font-weight: 600;
          color: #767676;
        }
      }

      .abc {
        font-size: 14px;
        font-weight: 400;
        color: #444444;
      }
    }
  }
}
.clip{
  animation: slip 1s linear infinite;
}
.toLeft{
  animation: toLeft .5s linear;
}
.toRight{
  animation: toRight .5s linear;
}

@keyframes slip {
  0% {
    transform: rotateY(0);
  }
  100% {
    transform: rotateY(360deg);
  }
}
@keyframes toLeft {
  0%{
    transform: translateX(500px) translateY(-50%);
    opacity: 0.8;

  }
  100%{
    transform: translateX(0) translateY(-50%);
  }
}
@keyframes toRight {
  0%{
    transform: translateX(-500px) translateY(-50%);
    opacity: 0.8;

  }
  100%{
    transform: translateX(0) translateY(-50%);
  }
}
</style>
