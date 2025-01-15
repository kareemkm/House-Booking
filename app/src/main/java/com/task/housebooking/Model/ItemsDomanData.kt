package com.task.housebooking.Model

class ItemsDomanData {

    val items: List<ItemsDomain> = listOf(
        ItemsDomain(
            type = "Apartment",
            title = "Luxury Penthouse",
            address = "123 Main Street, City Center",
            pickPath = "item_1",
            description = "This stunning penthouse offers breathtaking views of the city skyline, modern interiors, and top-notch amenities including a private pool and gym.",
            score = 4.8,
            price = 15000,
            bed = 3,
            bath = 3,
            size = 2500,
            isGarage = true
        ),
        ItemsDomain(
            type = "Villa",
            title = "Spacious Villa",
            address = "456 Elm Road, Suburbia",
            pickPath = "item_2",
            description = "A beautifully designed villa featuring a lush garden, spacious living areas, and a fully equipped kitchen. Perfect for families seeking comfort and tranquility.",
            score = 4.7,
            price = 22000,
            bed = 5,
            bath = 4,
            size = 4000,
            isGarage = true
        ),
        ItemsDomain(
            type = "Condo",
            title = "Beach Condo",
            address = "789 Ocean Drive, Coastal Area",
            pickPath = "item_3",
            description = "Enjoy the coastal lifestyle in this sleek condo just steps away from the beach. Includes a balcony with sea views and access to a shared pool.",
            score = 4.5,
            price = 12000,
            bed = 2,
            bath = 2,
            size = 1800,
            isGarage = false
        ),
        ItemsDomain(
            type = "Townhouse",
            title = "Family Townhouse",
            address = "321 Oak Lane, Greenfield",
            pickPath = "item_4",
            description = "This charming townhouse offers a spacious layout, a backyard, and proximity to schools and parks, making it ideal for families with children.",
            score = 4.6,
            price = 14000,
            bed = 4,
            bath = 3,
            size = 2000,
            isGarage = true
        ),
        ItemsDomain(
            type = "Studio",
            title = "Cozy Studio",
            address = "654 Market Street, Downtown",
            pickPath = "item_2",
            description = "A compact and stylish studio apartment, perfect for singles or young professionals. Located in the vibrant downtown area close to shops and restaurants.",
            score = 4.2,
            price = 8000,
            bed = 1,
            bath = 1,
            size = 500,
            isGarage = false
        )
    )



}