<template>
  <div class="layout">
<!--    <Header/>-->
    <HeaderNew/>
    <router-view class="container-fluid"/>
  </div>
</template>

<script>
import HeaderNew from "@/views/_layout/HeaderNew";

export default {
  name: "Layout",
  components: {HeaderNew},
}
</script>

<style scoped lang="scss">
  .layout{
    width: 100%;
  }
</style>
