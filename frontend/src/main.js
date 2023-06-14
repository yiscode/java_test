import { createApp } from 'vue'
import App from './App.vue'
import { createRouter, createWebHistory } from 'vue-router'
import UserList from './components/User_list.vue'
import LikeList from './components/LikeList.vue'

const routes = [
  { path: '/', component: UserList },
  {
    path: '/:id',
    component: LikeList,
    name: 'likes'
  },
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

createApp(App)
  .use(router)
  .mount('#app')