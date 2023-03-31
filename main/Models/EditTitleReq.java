package main.Models;

public class EditTitleReq extends Request{

    private String newTitle;

    public EditTitleReq(String requestID, String requesterID, String requesteeID,
                            String requestType, requestStatus_ENUM status, String projectID, String comment, String newTitle){
        super(requestID, requesterID, requesteeID, requestType, status, projectID, comment);
        this.newTitle = newTitle;
    }

    public String getTitle() {
        return newTitle;
    }

    public void setTitle(String newTitle) {
        this.newTitle = newTitle;
    }

    @Override
    public String getComments() {
        
        return super.getComments();
    }

    @Override
    public String getProjectID() {
        
        return super.getProjectID();
    }

    @Override
    public String getRequestID() {
        
        return super.getRequestID();
    }

    @Override
    public requestStatus_ENUM getRequestStatus() {
        
        return super.getRequestStatus();
    }

    @Override
    public String getRequestType() {
        
        return super.getRequestType();
    }

    @Override
    public String getRequesterID() {
        
        return super.getRequesterID();
    }

    @Override
    public void setComments(String comments) {
        
        super.setComments(comments);
    }

    @Override
    public void setProjectID(String projectID) {
        
        super.setProjectID(projectID);
    }

    @Override
    public void setRequestID(String requestID) {
        
        super.setRequestID(requestID);
    }

    @Override
    public void setRequestStatus(requestStatus_ENUM requestStatus) {
        
        super.setRequestStatus(requestStatus);
    }

    @Override
    public void setRequestType(String requestType) {
        
        super.setRequestType(requestType);
    }

    @Override
    public void setRequesterID(String requesterID) {
        
        super.setRequesterID(requesterID);
    }
}