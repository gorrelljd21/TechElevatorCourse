import axios from 'axios';

const http = axios.create({ //same role as RestTemplate, messaging gateway
  baseURL: "http://localhost:3000"
});

export default {

  getBoards() {
    return http.get('/boards'); //axios handles attaching this to baseURL
  },

  getCards(boardID) {
    return http.get(`/boards/${boardID}`)
  },

  getCard(boardID, cardID) {
    return http.get(`/boards/${boardID}`).then((response) => {
      const cards = response.data.cards;
      return cards.find(card => card.id == cardID);
    })
  }
}