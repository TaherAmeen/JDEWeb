/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tmh.jdeweb;
import javax.ws.rs.*;
/**
 *
 * @author Taher
 */
@Path("/board")
public class Board {
    @GET
    @Produces("text/html")
    public String show(){
        return "<h1>Hi</h1>";
    }
}
