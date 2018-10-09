package edu.cnm.deepdive.dicewarecilent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DicewareService {

  @GET("diceware")
  Call<String[]> get(@Query("length") int length);

}
