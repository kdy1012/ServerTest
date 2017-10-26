package kr.co.tjeit.servertest.util;

import android.content.Context;
import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


/**
 * Created by KJ_Studio on 2015-12-24.
 */
public class ServerUtil {

    //    서버와 통신을 하기 위한 ip주소
    private final static String BASE_URL = "http://13.124.171.21/";

    public interface JsonResponseHandler {
        void onResponse(JSONObject json);
    }

    public static void sign_in(final Context context,
                               final String user_id,
                               final String user_pw,
                               final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/sign_in";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", user_id); // 사용자가 입력하는 아이디. (cho881020)
        data.put("user_pw", user_pw);

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }

    public static void sign_up(final Context context,
                              final String user_id,
                              final String user_pw,
                              final String name,
                              final int gender,
                              final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/sign_up";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", user_id); // 사용자가 입력하는 아이디. (cho881020)
        data.put("user_pw", user_pw);
        data.put("name", name);
        data.put("gender", gender+"");

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }

    public static void test(final Context context, final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/hello_json";
        //		String registrationId = ContextUtil.getRegistrationId(context);

//        Map<String, String> data = new HashMap<String, String>();
//        data.put("user_id", id); // 사용자가 입력하는 아이디. (cho881020)
//        data.put("password", pw);
//        data.put("name", name);
//        data.put("gender", gender+"");
//        data.put("phone_num", phone_num);
//        data.put("os", "Android");
//        data.put("device_token", 기기고유값);

        AsyncHttpRequest.post(context, url, null, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }



    public static void getAllStores(final Context context, final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/getAllStores";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
//        data.put("user_id", id); // 사용자가 입력하는 아이디. (cho881020)
//        data.put("password", pw);

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


    public static void sign_out(final Context context, final int user_id, final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/sign_out";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", user_id + ""); // DB에 입력되어있는 숫자 아이디. (40)

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


    public static void getStoreInfo(final Context context, final int storeId, final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/getStoreInfo";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("store_id", storeId + ""); // 사용자가 입력하는 아이디. (cho881020)
//        data.put("password", pw);

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


    public static void checkDuplId(final Context context, final String id, final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/checkDuplId";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", id);

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


//    서버에 주문 넣기.

    public static void makeOrder(final Context context,
                                 final int user_id,
                                 final int store_id,
                                 final int seat_id,
                                 final String orderJson,
                                 final Calendar reservation_date,
                                 final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/makeOrder";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.KOREA);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", user_id + "");
        data.put("store_id", store_id + "");
        data.put("seat_id", seat_id + "");
        data.put("orderJson", orderJson);
        data.put("reservation_date", sdf.format(reservation_date.getTime()));
//        예약 일시 : reservation_date / 2017-09-29 18:30 (String)

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


//    내 주문 목록 가져오기.

    public static void getMyOrders(final Context context, final int user_id, final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/getMyOrders";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", user_id + "");

        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


// 비밀번호 변경 기능.

    public static void changePassword(final Context context,
                                      final int user_id,
                                      final String old_password,
                                      final String new_password,
                                      final JsonResponseHandler handler) {
        String url = BASE_URL + "mobile/changePassword";
        //		String registrationId = ContextUtil.getRegistrationId(context);

        Map<String, String> data = new HashMap<String, String>();
        data.put("user_id", user_id + "");
        data.put("old_password", old_password);
        data.put("new_password", new_password);


        AsyncHttpRequest.post(context, url, data, false, new AsyncHttpRequest.HttpResponseHandler() {

            @Override
            public boolean onPrepare() {
                return true;
            }

            @Override
            public void onResponse(String response) {
                Log.i("RESPONSE", response);
                try {
                    JSONObject json = new JSONObject(response);

                    if (handler != null)
                        handler.onResponse(json);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinish() {

            }

            @Override
            public void onCancelled() {

            }

        });
    }


}
