import Vue from 'vue'
import App from './app.vue'
import router from './router';
import axios from 'axios';

Vue.config.productionTip = false;
// Vue.prototype.xxx 可以理解为Vue组件的全局变量,
// 可以再任意组件中, 使用this.xxx来获取这个值, $是代表vue全局属性的一个约定
Vue.prototype.$ajax = axios;

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
