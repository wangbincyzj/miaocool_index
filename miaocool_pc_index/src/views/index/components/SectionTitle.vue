<template>
  <div class="sectionTitle">
    <span class="title" :style="{color: titleColor}">{{ title }}</span>
    <span class="engTitle" :style="{color: engTitleColor}">- {{ engTitle }}</span>
  </div>
</template>

<script>
export default {
  name: "SectionTitle",
  props: {
    title: String,
    engTitle: String,
    titleColor: {
      default: "#222222"
    },
    engTitleColor: {
      default: "#767676"
    }
  }
}
</script>

<style scoped lang="scss">
.sectionTitle{
  text-align: center;
  margin: 80px 0;
}
.title {
  height: 40px;
  font-size: 28px;
  font-family: PingFangSC-Semibold, PingFang SC;
  font-weight: 600;
  color: #222222;
  line-height: 40px;
}

.engTitle {

  height: 40px;
  font-size: 28px;
  font-family: PingFangSC-Semibold, PingFang SC;
  font-weight: 600;
  color: #767676;
  line-height: 40px;
}
</style>
