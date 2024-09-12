function bookRoom() {
  const customerName = document.getElementById("customerName").value;
  const roomType = document.getElementById("roomType").value;
  const checkinDate = document.getElementById("checkin").value;
  const checkoutDate = document.getElementById("checkout").value;

  alert(
    `Booking for ${customerName} in a ${roomType} from ${checkinDate} to ${checkoutDate} is confirmed.`
  );
}
