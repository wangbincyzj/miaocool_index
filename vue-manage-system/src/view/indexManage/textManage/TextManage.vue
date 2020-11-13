<template>
  <div>
    <div class="crumbs">
      <el-breadcrumb separator="/">
        <el-breadcrumb-item>
          <i class="el-icon-lx-calendar"></i> 首页管理
        </el-breadcrumb-item>
        <el-breadcrumb-item>文案管理</el-breadcrumb-item>
      </el-breadcrumb>
    </div>
    <div class="container">
      <el-row>
        <el-col :span="5">
          <el-menu default-active="1">
            <el-menu-item index="1">头部文案</el-menu-item>
            <el-menu-item index="2">建站亮点</el-menu-item>
            <el-menu-item index="3">网站类型</el-menu-item>
            <el-menu-item index="4">合作案例</el-menu-item>
            <el-menu-item index="5">咨询</el-menu-item>
          </el-menu>
        </el-col>
        <el-col :span="18" :offset="1">
          <el-card>
            <el-image fit="cover" src="https://s1.ax1x.com/2020/11/02/BrJldK.png"></el-image>
          </el-card>
          <el-upload
              class="upload-demo"
              drag
              action="https://jsonplaceholder.typicode.com/posts/"
              multiple>
            <i class="el-icon-upload"></i>
            <div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
            <div class="el-upload__tip" slot="tip">只能上传jpg/png文件，且不超过500kb</div>
          </el-upload>
        </el-col>
      </el-row>
    </div>
  </div>
</template>

<script>
export default {
  name: "TextManage"
}
</script>

<style scoped>

</style>
