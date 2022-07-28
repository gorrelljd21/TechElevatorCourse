<template>
  <form class="new-book-form">
    <label for="title">Title</label>
    <input
      class="title-input"
      type="text"
      name="title"
      id="title"
      v-model="newBook.title"
    />
    <br />
    <label for="author">Author</label>
    <input
      class="author-input"
      type="text"
      name="author"
      id="author"
      v-model="newBook.author"
    />
    <br />
    <label for="isbn">ISBN</label>
    <input
      class="isbn-input"
      type="number"
      name="isbn"
      id="isbn"
      v-model="newBook.isbn"
    />
    <br />
    <button type="submit" @click.prevent="saveBook">Add New Book</button>
  </form>
</template>

<script>
export default {
  name: "new-book",
  props: ["new"],
  data() {
    return {
      newBook: {},
    };
  },
  methods: {
    saveBook() {
      this.$store.commit("ADD_BOOK", this.newBook);
    },
  },
};
</script>
