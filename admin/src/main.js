import Vue from 'vue'
import App from './app.vue'
import router from './router';
import axios from 'axios';
import filter from './filter/filter';


Vue.config.productionTip = false;
// Vue.prototype.xxx 可以理解为Vue组件的全局变量,
// 可以再任意组件中, 使用this.xxx来获取这个值, $是代表vue全局属性的一个约定
Vue.prototype.$ajax = axios;

/**
 * axios拦截器
 */
axios.interceptors.request.use(function (config) {
  console.log("请求：", config);
  return config;
}, error => {});
axios.interceptors.response.use(function (response) {
  console.log("返回结果：", response);
  return response;
}, error => {});

// 全局过滤器
Object.keys(filter).forEach(key => {
  Vue.filter(key, filter[key])
});

new Vue({
  router,
  render: h => h(App),
}).$mount('#app');

console.log("环境：", process.env.NODE_ENV);

