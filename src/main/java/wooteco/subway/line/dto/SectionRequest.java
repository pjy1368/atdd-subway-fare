package wooteco.subway.line.dto;

import javax.validation.constraints.Min;

public class SectionRequest {

    @Min(1L)
    private Long upStationId;
    @Min(1L)
    private Long downStationId;
    @Min(1)
    private int distance;

    public SectionRequest() {
    }

    public SectionRequest(Long upStationId, Long downStationId, int distance) {
        this.upStationId = upStationId;
        this.downStationId = downStationId;
        this.distance = distance;
    }

    public Long getUpStationId() {
        return upStationId;
    }

    public Long getDownStationId() {
        return downStationId;
    }

    public int getDistance() {
        return distance;
    }
}
