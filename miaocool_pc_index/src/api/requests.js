import axios from "axios"
import {config} from "@/config/config"
import Vue from "vue"


axios.defaults.baseURL = config.baseUrl
axios.defaults.timeout = config.timeout

axios.interceptors.response.use(value => {
  const data = value.data

  /*// 这里是数据层报错
  if (data.code !== 0) {
    Vue.prototype.$message({
      message: data.msg,
      type: "warning"
    })
  }*/
  return data
}, err => {  // 这里是http层报错
  /*Vue.prototype.$message({
    message: err,
    type: "error"
  })*/
  return {code: 999, msg: err.toString()}
})

axios.interceptors.request.use(value => {
  return value
})


let get = function (url, params) {
  if (params instanceof Number) {
    return axios.get(url + `/${params}`)
  } else {
    return axios.get(url, {params})
  }
}

let post = function (url, data) {
  return axios.post(url, data)
}

let put = function (url, data) {
  return axios.put(url, data)
}

let del = function (url, data) {
  return axios.delete(url, {data})
}

/**
 * Rest请求基础类
 * @param url 资源路径
 */
export class RestRequest {
  constructor(url) {
    this.url = url
    return this
  }

  get(id) {
    return requests.get(this.url + `/${id}`)
  }

  getAll(data) {
    return requests.get(this.url, data)
  }

  add(data) {
    return requests.post(this.url, data)
  }

  update(data) {
    return requests.put(this.url, data)
  }

  updateBatch(list) {
    const url = this.url + "s"
    return requests.put(url, list)
  }

  delete(data) {
    return requests.del(this.url, data)
  }
}


export const requests = {
  get, post, put, del
}
