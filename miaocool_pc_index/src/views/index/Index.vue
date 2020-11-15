<template>
  <div class="index">
    <IndexBanner/>
    <IndexHighLight/>
    <IndexType/>
    <IndexCase/>
    <IndexAd/>
    <IndexFooter/>
  </div>
</template>

<script>
import IndexBanner from "@/views/index/IndexBanner";
import IndexAd from "@/views/index/IndexAd";
import IndexFooter from "@/views/index/IndexFooter";
import IndexHighLight from "@/views/index/IndexHighLight"
import IndexType from "@/views/index/IndexType"
import IndexCase from "@/views/index/IndexCase"

export default {
  name: "Index",
  components: {
    IndexCase,
    IndexType,
    IndexHighLight,
    IndexFooter, IndexAd, IndexBanner,}
}
</script>

<style scoped lang="scss">
.index {
  width: 100%;
}
</style>
