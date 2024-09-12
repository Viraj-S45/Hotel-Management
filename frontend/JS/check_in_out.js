function manageStay() {
  const customerName = document.getElementById("customerName").value;
  const roomNumber = document.getElementById("roomNumber").value;
  const action = document.getElementById("stayRecord").value;

  if (action === "checkin") {
    alert(`Customer ${customerName} has checked into room ${roomNumber}.`);
  } else {
    alert(`Customer ${customerName} has checked out of room ${roomNumber}.`);
  }
}
