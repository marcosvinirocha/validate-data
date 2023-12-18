package org.acme.resource;

import jakarta.validation.Valid;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import org.acme.dto.Product;
import org.acme.response.Result;

@Path("/product")
public class ProductResource {
    @POST
    public Result addProduct(@Valid Product product) {
        return new Result("Produto inserido é válido.");
    }

}
