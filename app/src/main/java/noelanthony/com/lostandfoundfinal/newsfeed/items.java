package noelanthony.com.lostandfoundfinal.newsfeed;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Noel on 16/02/2018.
 */
@IgnoreExtraProperties
public class items {
    private String itemName;
    private String dateSubmitted;
    private String locationDescription;
    private String poster;
    private String status;
    private String imageID;
    private boolean isSelected;
    private int approvalStatus;
    private String itemID;
    private String description;
    private String uid;
    private Double latitude;
    private Double longitude;



    public items(){}

    public items(String itemName, String dateSubmitted, String locationDescription, String poster,String status,
                 String imageID,boolean isSelected,int approvalStatus,String itemID, String description,String uid, Double latitude, Double longitude) {
        this.itemName = itemName;
        this.dateSubmitted = dateSubmitted;
        this.locationDescription = locationDescription;
        this.poster = poster;
        this.status = status;
        this.imageID = imageID;
        this.isSelected = isSelected;
        this.approvalStatus = approvalStatus;
        this.itemID = itemID;
        this.description = description;
        this.uid = uid;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public String getitemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getdateSubmitted() {
        return dateSubmitted;
    }

    public String getlocationDescription() {
        return locationDescription;
    }

    public String getPoster() {
        return poster;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public int getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(int approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }
}



