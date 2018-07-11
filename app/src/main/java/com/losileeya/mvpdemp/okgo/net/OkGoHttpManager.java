package com.losileeya.mvpdemp.okgo.net;

import android.app.Activity;
import android.content.Context;
import android.text.format.Formatter;

import com.google.gson.Gson;
import com.losileeya.mvpdemp.GApp;
import com.losileeya.mvpdemp.okgo.callback.DialogCallback;
import com.losileeya.mvpdemp.okgo.callback.JsonCallback;
import com.losileeya.mvpdemp.okgo.callback.StringDialogCallback;
import com.losileeya.mvpdemp.okgo.model.BruceResponse;
import com.losileeya.mvpdemp.okgo.utils.Urls;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.FileCallback;
import com.lzy.okgo.model.HttpParams;
import com.lzy.okgo.model.Progress;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @name thinkine
 * @class com.losileeya.mvpdemp.okgo.net
 * @class describe
 * @anthor ${bruce} QQ:275762645
 * @time 2018/7/11
 * @change
 * @chang time
 * @class describe  详细的反正参数参考 OkGoResponseUtil
 */
public class OkGoHttpManager<T> {
    /**
     * 单例
     */
    private static volatile OkGoHttpManager mEasyHttpManager;
    private String dialogText;//显示弹框的时候显示的文字

    /**
     * 获取单例
     *
     * @return EasyHttpManager 的单例对象
     */
    public static OkGoHttpManager getInstance() {
        if (mEasyHttpManager == null) {
            synchronized (OkGoHttpManager.class) {
                if (mEasyHttpManager == null)
                    mEasyHttpManager = new OkGoHttpManager();
            }
        }
        mEasyHttpManager.dialogText = "请稍候\u2026";
        return mEasyHttpManager;
    }

    /**
     * 将字符串转换成对象(图片转换)
     */
    public static <T> T JSONToObject(String json, Class<T> beanClass) {
        Gson gson = new Gson();
        T res = gson.fromJson(json, beanClass);
        return res;
    }

    //==================================1.get方式===============================//
    public void doHttpGetRequest(Activity activity) {
        OkGo.<BruceResponse<String>>get(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new DialogCallback<BruceResponse<String>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<String>> response) {

                    }

                    @Override
                    public void onError(Response<BruceResponse<String>> response) {

                    }
                });
    }

    //下载文件
    public void doHttpGetDownLoadFileRequest(Activity activity) {
        OkGo.<File>get(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new FileCallback("OkGo.apk") {

                    @Override
                    public void onStart(Request<File, ? extends Request> request) {
//                        btnFileDownload.setText("正在下载中");
                    }

                    @Override
                    public void onSuccess(Response<File> response) {
//                        handleResponse(response);
//                        btnFileDownload.setText("下载完成");
                    }

                    @Override
                    public void onError(Response<File> response) {
//                        handleError(response);
//                        btnFileDownload.setText("下载出错");
                    }

                    @Override
                    public void downloadProgress(Progress progress) {
                        System.out.println(progress);

//                        String downloadLength = Formatter.formatFileSize(getApplicationContext(), progress.currentSize);
//                        String totalLength = Formatter.formatFileSize(getApplicationContext(), progress.totalSize);
//                        tvDownloadSize.setText(downloadLength + "/" + totalLength);
//                        String speed = Formatter.formatFileSize(getApplicationContext(), progress.speed);
//                        tvNetSpeed.setText(String.format("%s/s", speed));
//                        tvProgress.setText(numberFormat.format(progress.fraction));
//                        pbProgress.setMax(10000);
//                        pbProgress.setProgress((int) (progress.fraction * 10000));
                    }
                });
    }

    //==================================1.get方式===============================//

    //==================================2.head方式===============================//
    public void doHttpHeadRequest(Activity activity) {
        OkGo.<String>head(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new StringDialogCallback(activity) {
                    @Override
                    public void onSuccess(Response<String> response) {

                    }

                    @Override
                    public void onError(Response<String> response) {

                    }
                });
    }

    //==================================3.head方式===============================//
    public void doHttpOptionsRequest(Activity activity) {
        OkGo.<BruceResponse<String>>options(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new DialogCallback<BruceResponse<String>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<String>> response) {

                    }

                    @Override
                    public void onError(Response<BruceResponse<String>> response) {

                    }
                });
    }

    //==================================4.post方式===============================//
    public void doHttpPostRequest(Activity activity,String url,HttpParams httpParams,final OkGoHttpListenter okGoHttpListenter) {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("param1", "paramValue1");
//        map.put("param2", "paramValue2");
//        map.put("param3", "paramValue3");
//        HttpParams httpParams = new HttpParams();
//        httpParams.put("param1", "paramValue1");
//        httpParams.put("param2", "paramValue2");

        OkGo.<BruceResponse<String>>post(url)//
                .tag(this)//
//                .headers("header1", "headerValue1")//
                .params(httpParams)//
                .execute(new DialogCallback<BruceResponse<String>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<String>> response) {
                        okGoHttpListenter.onSuccess(response.body().toString());
                    }

                    @Override
                    public void onError(Response<BruceResponse<String>> response) {
                        okGoHttpListenter.onError(response.message());
                    }
                });
    }

    //请求带json数据
    public void doHttpPostToJsonRequest(Activity activity) {
        HashMap<String, String> params = new HashMap<>();
        params.put("key1", "value1");
        params.put("key2", "这里是需要提交的json格式数据");
        params.put("key3", "也可以使用三方工具将对象转成json字符串");
        params.put("key4", "其实你怎么高兴怎么写都行");
        JSONObject jsonObject = new JSONObject(params);

        OkGo.<BruceResponse<T>>post(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
//                .params("param1", "paramValue1")//  这里不要使用params，upJson 与 params 是互斥的，只有 upJson 的数据会被上传
                .upJson(jsonObject)//
                .execute(new DialogCallback<BruceResponse<T>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {
//                        handleResponse(response);
                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {
//                        handleError(response);
                    }
                });
    }

    //上传xml数据，这里就可以自己指定请求头
    public void doHttpPostToHtmlRequest(Activity activity) {
        OkGo.<BruceResponse<T>>post(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
//                .params("param1", "paramValue1")// 这里不要使用params，upString 与 params 是互斥的，只有 upString 的数据会被上传
                .upString("这是要上传的长文本数据！")//upBytes upFile
//                .upString("这是要上传的长文本数据！", MediaType.parse("application/xml"))// 比如上传xml数据，这里就可以自己指定请求头
                .execute(new DialogCallback<BruceResponse<T>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {
//                        handleResponse(response);
                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {
//                        handleError(response);
                    }
                });
    }

    //单个上传文件
    public void doHttpPostToFileRequest(Activity activity) {
        OkGo.<BruceResponse<T>>post(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
//                .params("param1", "paramValue1")// 这里不要使用params，upBytes 与 params 是互斥的，只有 upBytes 的数据会被上传
                .upFile(new File(""))//文件路径
                .execute(new DialogCallback<BruceResponse<T>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {
//                        handleResponse(response);
                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {
//                        handleError(response);
                    }
                });
    }

    private ArrayList<String> imageItems;
    //多个文件上传
    public void doHttpPostToMoreFileRequest(Activity activity) {
        ArrayList<File> files = new ArrayList<>();
        if (imageItems != null && imageItems.size() > 0) {
            for (int i = 0; i < imageItems.size(); i++) {
                files.add(new File(imageItems.get(i)));
            }
        }
        //拼接参数
        OkGo.<BruceResponse<T>>post(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .headers("header2", "headerValue2")//
                .params("param1", "paramValue1")//
                .params("param2", "paramValue2")//
//                .params("file1",new File("文件路径"))   //这种方式为一个key，对应一个文件
//                .params("file2",new File("文件路径"))
//                .params("file3",new File("文件路径"))
                .addFileParams("file", files)           // 这种方式为同一个key，上传多个文件
                .execute(new JsonCallback<BruceResponse<T>>() {
                    @Override
                    public void onStart(Request<BruceResponse<T>, ? extends Request> request) {
//                        btnFormUpload.setText("正在上传中...");
                    }

                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {
//                        handleResponse(response);
//                        btnFormUpload.setText("上传完成");
                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {
//                        handleError(response);
//                        btnFormUpload.setText("上传出错");
                    }

                    @Override
                    public void uploadProgress(Progress progress) {
                        System.out.println("uploadProgress: " + progress);

//                        String downloadLength = Formatter.formatFileSize(getApplicationContext(), progress.currentSize);
//                        String totalLength = Formatter.formatFileSize(getApplicationContext(), progress.totalSize);
//                        tvDownloadSize.setText(downloadLength + "/" + totalLength);
//                        String speed = Formatter.formatFileSize(getApplicationContext(), progress.speed);
//                        tvNetSpeed.setText(String.format("%s/s", speed));
//                        tvProgress.setText(numberFormat.format(progress.fraction));
//                        pbProgress.setMax(10000);
//                        pbProgress.setProgress((int) (progress.fraction * 10000));
                    }
                });
    }

    //==================================4.post方式===============================//

    //

    //==================================5.put方式===============================//
    public void doHttpPutRequest(Activity activity) {
        OkGo.<BruceResponse<T>>put(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new DialogCallback<BruceResponse<T>>(activity) {

                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {

                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {

                    }
                });
    }

    //==================================6.Delete方式===============================//
    public void doHttpDeleteRequest(Activity activity) {
        OkGo.<BruceResponse<T>>delete(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .upString("这是要上传的数据")//
                .execute(new DialogCallback<BruceResponse<T>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {

                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {

                    }
                });
    }

    //==================================7.Trace方式===============================//
    public void doHttpTraceRequest(Activity activity) {
        OkGo.<BruceResponse<T>>trace(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new DialogCallback<BruceResponse<T>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {

                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {

                    }
                });
    }

    //==================================8.patch方式===============================//
    public void doHttpPatchRequest(Activity activity) {
        OkGo.<BruceResponse<T>>patch(Urls.Login_Thinkine)//
                .tag(this)//
                .headers("header1", "headerValue1")//
                .params("param1", "paramValue1")//
                .execute(new DialogCallback<BruceResponse<T>>(activity) {
                    @Override
                    public void onSuccess(Response<BruceResponse<T>> response) {

                    }

                    @Override
                    public void onError(Response<BruceResponse<T>> response) {

                    }
                });
    }

}
