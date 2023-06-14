<template>
  <div>
    <h1>Like list</h1>
    <table>
      <thead>
        <tr>
          <th>Order name</th>
          <th>Product name</th>
          <th>Price</th>
          <th>Fee rate</th>
          <th>Account</th>
          <th>Total fee</th>
          <th>Total amount</th>
        </tr>
      </thead>
      <tbody style="text-align: center;">
        <tr v-for="item in likes" :key="item.likeList.sn">
          <td>{{ item.likeList.order_name }}</td>
          <td>{{ item.product.productname }}</td>
          <td>{{ item.product.price }}</td>
          <td>{{ item.product.fee_rate }}</td>
          <td>{{ item.likeList.account }}</td>
          <td>{{ item.likeList.total_fee }}</td>
          <td>{{ item.likeList.total_amount }}</td>
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
      likes: []
    }
  },
  mounted() {
    axios.get(`http://localhost:2022/users/${this.$route.params.id}`)
      .then(response => {
        this.likes = response.data
        console.log(response.data)
      })
      .catch(error => {
        console.log(error)
      })
  }
}
</script>
<style>
.container {
  text-align: center;
}
</style>