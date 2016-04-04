package com.example.androidchoi.helloguide.model;

/**
 * Created by Choi on 2016-04-04.
 */
/*
    서버에서 저장하는 Place 정보
    리스트에서 보여줄 정보(건물명, 간략정보, 이미지url) 저장.
    API에서 제공 하지 않는 정보 저장.
    API요청에 필요한 종목코드, 지정번호, 시도코드 저장
*/
public class PlaceServerData {

    private String mName;
    private String mSimpleContent; // 간략 정보
    private String mImageUrl;
    private String ccbaKdcd; // 종목코드
    private String ccbaAsno; // 지정번호
    private String ccbaCtcd; // 시도코드

    // 샘플 Data 생성을 위한 생성자
    public PlaceServerData(String name, String content, String url,
                           String code1, String code2, String code3){
        mName = name;
        mSimpleContent = content;
        mImageUrl = url;
        ccbaKdcd = code1;
        ccbaAsno = code2;
        ccbaCtcd = code3;
    }

    public String getName() {
        return mName;
    }

    public String getSimpleContent() {
        return mSimpleContent;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCcbaKdcd() {
        return ccbaKdcd;
    }

    public String getCcbaAsno() {
        return ccbaAsno;
    }

    public String getCcbaCtcd() {
        return ccbaCtcd;
    }
}