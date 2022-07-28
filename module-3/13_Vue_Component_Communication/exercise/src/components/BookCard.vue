<template>
  <div class="card" :key="book.isbn">
    <h2 class="book-title">{{ book.title }}</h2>
    <img
      v-if="book.isbn"
      v-bind:src="
        'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'
      "
    />
    <h3 class="book-author">{{ book.author }}</h3>
    <button class="mark-read" @click="changeStatus" v-if="!book.read">
      Mark Read
    </button>
    <button class="mark-unread" @click="changeStatus" v-if="book.read">
      Mark Unread
    </button>
  </div>
</template>

<script>
export default {
  name: "book-card",
  props: ["book"],
  data() {
    return {
      showButton: false,
    };
  },
  methods: {
    changeStatus() {
      this.$store.commit("FLIP_READ_STATUS", this.book);
    },
  },
};
</script>

<style>
.card {
  border: 2px solid black;
  border-radius: 10px;
  width: 250px;
  height: 550px;
  margin: 20px;
}

.card.read {
  background-color: lightgray;
}

.card .book-title {
  font-size: 1.5rem;
}

.card .book-author {
  font-size: 1rem;
}
</style>