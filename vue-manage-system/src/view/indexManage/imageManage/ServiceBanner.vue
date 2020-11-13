<template>
  <div>
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
  </div>
</template>

<script>
export default {
name: "ServiceBanner"
}
</script>

<style scoped>

</style>
