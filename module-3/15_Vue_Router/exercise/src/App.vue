<template>
  <div id="app">
    <nav>
      <router-link :to="{ name: 'home' }">Home</router-link>
      <span> | </span>
      <router-link :to="{ name: 'myBooks' }">My Books</router-link>
    </nav>
    <router-view />
    <nav>
      <router-link :to="{ name: 'addBook' }"
        >Add Book to Reading List</router-link
      >
    </nav>
  </div>
</template>

<script>
export default {
  name: "app",
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}
</style>
