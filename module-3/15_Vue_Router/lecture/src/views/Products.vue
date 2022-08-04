<template>
  <div class="products">
    <h1>Products</h1>
    <product-list></product-list>
  </div>
</template>

<script>
//@ - alias for src folder
import ProductList from "@/components/ProductsList"; //.vue is not necessary

export default {
  components: {
    ProductList,
  },
};
</script>

<style scoped>
</style>