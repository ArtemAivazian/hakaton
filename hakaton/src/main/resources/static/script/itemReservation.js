document.getElementById("reservationForm").addEventListener("submit", function (event) {
    event.preventDefault();

    const itemName = document.getElementById("itemName").value;
    const price = document.getElementById("price").value;
    const deliveryPoint = document.getElementById("deliveryPoint").value;
    const email = document.getElementById("email").value;

    const data = {
    "item_name": itemName,
    "price": price,
    "delivery_point": deliveryPoint,
    "email": email
    };

    fetch("http://localhost:8080/item/add", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(data)
    })
            .then(response => {
                if (response.status === 200) {
                    alert("Reservation was added successfully!");
                    window.location.href = "http://localhost:8080/displayItemStorage";
                } else {
                    alert("Error submitting reservation.");
                }
            })
            .catch(error => {
                console.error("Error:", error);
                alert("Error submitting reservation.");
            });

    const itemId = document.getElementById("itemId").value;
    fetch(`http://localhost:8080/deleteItem/${itemId}`, {
        method: "DELETE"
    })
            .catch(error => {
                console.error("Error:", error);
                alert("Error deleting item.");
            });

});