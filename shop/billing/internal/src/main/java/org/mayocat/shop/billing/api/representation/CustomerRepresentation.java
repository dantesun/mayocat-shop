package org.mayocat.shop.billing.api.representation;

import org.mayocat.shop.billing.model.Customer;

/**
 * @version $Id$
 */
public class CustomerRepresentation
{
    private String firstName;

    private String lastName;

    private String email;

    public CustomerRepresentation()
    {

    }

    public CustomerRepresentation(Customer customer)
    {
        setEmail(customer.getEmail());
        setFirstName(customer.getFirstName());
        setLastName(customer.getLastName());
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}