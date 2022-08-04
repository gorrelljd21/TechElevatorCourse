import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products'
import ProductDetail from '@/views/ProductDetail'
import AddReview from '@/views/AddReview'

Vue.use(VueRouter) //telling view router is in use, view will inject it
//into our components

const routes = [ //array of routes used when we instantiate view router
  {
    path: '/', //maps route of application
    name: 'products', //route named products
    component: Products //implemented as view named products, if it gets a hit
  },
  {
    path: '/products/:id', //: - identify's a path/route variable
    name: 'product-details',
    component: ProductDetail,
  },
  {
    path: '/products/:id/add-review',
    name: 'add-review',
    component: AddReview,
  },
]

const router = new VueRouter({
  mode: 'history', //want to use html 5 history API, allows view to manipulate URL
  base: process.env.BASE_URL,
  routes
})

export default router

//this is all pulled into main.js