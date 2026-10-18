package com.msoft.correncyconverter.apiresponse;

import java.time.Instant;

public class ApiResponse<T> {

  private  boolean success;
  private   String message;
  private  T data;
  private  Instant timestamp;


  public ApiResponse() {}

    public ApiResponse(boolean success, String message, T data){
      this.success =success;
      this.message = message;
      this.data = data;

    }

    public boolean isSuccess(){
      return this.success;
    }

    public void setSuccess(boolean success){
      this.success = success;
    }

    public String getMessage(){
      return this.message;
    }

    public void setMessage(String message){
      this.message = message;
    }


    public T getData(){
      return this.data;
    }

    public void setData(T data){
      this.data = data;
    }
}


