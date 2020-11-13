<template>
  <div>
    <div class="crumbs">
      <el-breadcrumb separator="/">
        <el-breadcrumb-item>
          <i class="el-icon-lx-calendar"></i> 首页管理
        </el-breadcrumb-item>
        <el-breadcrumb-item>图片管理</el-breadcrumb-item>
      </el-breadcrumb>
    </div>
    <div class="container">
      <el-row>
        <el-col :span="5">
          <el-menu  default-active="HeaderBanner" @select="handleSelect">
            <el-menu-item index="HeaderBanner">HeaderBanner</el-menu-item>
            <el-menu-item index="ServiceBanner">ServiceBanner</el-menu-item>
            <el-menu-item index="Chat">Chat</el-menu-item>
          </el-menu>
        </el-col>
        <el-col :span="18" :offset="1">
          <component :is="is"/>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
import HeaderBanner from "@/view/indexManage/imageManage/HeaderBanner"
import ServiceBanner from "@/view/indexManage/imageManage/ServiceBanner"
import Chat from "@/view/indexManage/imageManage/Chat"
export default {
  name: "ImageManage",
  components:{
    HeaderBanner, ServiceBanner, Chat
  },
  data() {
    return {
      is: "HeaderBanner"
    }
  },
  methods:{
    handleSelect(index) {
      this.is = index
    }
  }
}
</script>

<style scoped>

</style>
