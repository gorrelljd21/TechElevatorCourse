
const pageTitle = 'My Shopping List';
const groceries = [
  'milk',
  'eggs',
  'cereal',
  'bread',
  'tea',
  'cookies',
  'noodles',
  'red sauce',
  'garlic bread',
  'salad',
]

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const pageTitleReference = document.getElementById('title');
  pageTitleReference.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceriesReference = document.getElementById('groceries');

  groceries.forEach((item) => {
    const container = document.createElement('li');
    container.classList.add('item');

    function addItem(container, groceries) {
      groceryItems.innerText = item;
      parent.appendChild(groceryItems);
    }

    container.innerText = item;
    groceriesReference.insertAdjacentElement('beforeend', container);
  })
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const listItems = document.querySelectorAll('.item');

  listItems.forEach((item) => {
    item.classList.add('completed');
  })
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
