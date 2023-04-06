package main.Models;

public class RegisterProjectReq extends Request{

    public RegisterProjectReq(String requestID, String requesterID, String requesteeID, String requestType,
                                requestStatus_ENUM status, String projectID, String comment) {
        super(requestID, requesterID, requesteeID, requestType, status, projectID, comment);
    }

}