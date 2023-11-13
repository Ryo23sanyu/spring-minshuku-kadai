const stripe = Stripe('pk_test_51O9Oi2EiYO09PcsXvq1zXwGPU5naWIUouvudyrUTkzQahbI8o6VUUOixP5rziRY3A0Enq2qZuNx8Bl3jhbhYiIuD0058ZLcWkk');
 const paymentButton = document.querySelector('#paymentButton');
 
 paymentButton.addEventListener('click', () => {
   stripe.redirectToCheckout({
     sessionId: sessionId
   })
 });