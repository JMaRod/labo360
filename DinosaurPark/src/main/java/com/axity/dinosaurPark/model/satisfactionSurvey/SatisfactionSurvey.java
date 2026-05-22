package com.axity.dinosaurPark.model.satisfactionSurvey;

/**
 * Encuesta de satisfacción
 */
public class SatisfactionSurvey
{
    private final int touristId;
    private final String enclosureName;
    private final SatisfactionScore satisfactionScore;

    public SatisfactionSurvey(int touristId, String enclosureName, SatisfactionScore satisfactionScore)
    {
        this.touristId = touristId;
        this.enclosureName = enclosureName;
        this.satisfactionScore = satisfactionScore;
    }

    public int getTouristId()
    {
        return touristId;
    }

    public String getEnclosureName()
    {
        return enclosureName;
    }

    public SatisfactionScore getSatisfactionScore()
    {
        return satisfactionScore;
    }
    
    
}
