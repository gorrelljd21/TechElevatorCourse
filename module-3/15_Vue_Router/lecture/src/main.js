import Vue from 'vue'
import App from './App.vue'
import store from './store'
import router from './router'

Vue.config.productionTip = false

new Vue({ //attaching store and view router to make use of it
  store,
  router,
  render: h => h(App)
}).$mount('#app') //instantiating view and mounting it to main app element

//creating view instance that is driving the application