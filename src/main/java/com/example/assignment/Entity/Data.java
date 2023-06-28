package com.example.assignment.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "data")
public class Data {
    @Id
    private String _Id;
    private String intensity;
    private String likelihood;
    private String relevance;
    private String end_year;
    private String start_year;
    private String country;
    private String topic;
    private String region;
    private String city;

    public Data() {
    }

    public Data(String _Id, String intensity, String likelihood, String relevance, String end_year, String start_year, String country, String topic, String region, String city) {
        this._Id = _Id;
        this.intensity = intensity;
        this.likelihood = likelihood;
        this.relevance = relevance;
        this.end_year = end_year;
        this.start_year = start_year;
        this.country = country;
        this.topic = topic;
        this.region = region;
        this.city = city;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    public String getLikelihood() {
        return likelihood;
    }

    public void setLikelihood(String likelihood) {
        this.likelihood = likelihood;
    }

    public String getRelevance() {
        return relevance;
    }

    public void setRelevance(String relevance) {
        this.relevance = relevance;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTopics() {
        return topic;
    }

    public void setTopics(String topics) {
        this.topic = topics;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String get_Id() {
        return _Id;
    }

    public void set_Id(String _Id) {
        this._Id = _Id;
    }

    public String getEnd_year() {
        return end_year;
    }

    public void setEnd_year(String end_year) {
        this.end_year = end_year;
    }

    public String getStart_year() {
        return start_year;
    }

    public void setStart_year(String start_year) {
        this.start_year = start_year;
    }

    @Override
    public String toString() {
        return "Data{" +
                "_Id='" + _Id + '\'' +
                ", intensity='" + intensity + '\'' +
                ", likelihood='" + likelihood + '\'' +
                ", relevance='" + relevance + '\'' +
                ", end_year='" + end_year + '\'' +
                ", start_year='" + start_year + '\'' +
                ", country='" + country + '\'' +
                ", topics='" + topic + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
