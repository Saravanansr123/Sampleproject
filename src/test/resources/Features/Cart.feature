Feature: Search product and Add to cart

	Scenario: Login Amazon and Search product then add to cart
	 
		Given user launch browser
		When user sign in by entering Email and pass
		And user search a product
		And user add to cart
		Then user close amazon