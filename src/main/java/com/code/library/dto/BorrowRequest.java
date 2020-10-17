package com.code.library.dto;

public class BorrowRequest {
    public String Sindex;
    public Long sampleId;

    public String  getSindex() {
        return Sindex;
    }

    public void setSindex(String  sindex) {
        Sindex = sindex;
    }

    public Long getSampleId() {
        return sampleId;
    }

    public void setSampleId(Long sampleId) {
        this.sampleId = sampleId;
    }

}
