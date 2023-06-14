<template>
  <div>
    <table>
      <thead>
        <tr>
          <th>Name</th>
          <th>Email</th>
          <th>Action</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="user in users" :key="user.user_id">
          <td>{{ user.user_name }}</td>
          <td>{{ user.email }}</td>
          <td>
            <router-link :to="{ name: 'likes', params: { id: user.user_id }}">View</router-link></td>
        </tr>
      </tbody>
    </table>
  </div>
</template>
<script>
import axios from 'axios'

export default {
  data() {
    return {
      users: []
    }
  },
  mounted() {
    axios.get('http://localhost:2022/users')
      .then(response => {
        this.users = response.data
      })
      .catch(error => {
        console.log(error)
      })
  }
}
</script>