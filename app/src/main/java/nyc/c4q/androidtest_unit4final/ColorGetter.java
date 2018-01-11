package nyc.c4q.androidtest_unit4final;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by oleg on 1/10/18.
 */

public interface ColorGetter {

    @GET("operable/cog/master/priv/css-color-names.json")
    Call<ColorObject> getColors();

}
