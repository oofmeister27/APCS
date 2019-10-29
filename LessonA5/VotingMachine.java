/**
 *
 * @author your name
 * period #
 *
 */

public class VotingMachine {
   //instance variables
   private int republicanVotes;
   private int democratVotes;
   private int independentVotes;

   public VotingMachine() {
      republicanVotes = 0;
      democratVotes = 0;
      independentVotes = 0;
   }
   public VotingMachine(int myDemocratVoters, int myRepublicanVoters, int myIndependentVoters) {
      republicanVotes = myRepublicanVoters;
      democratVotes = myDemocratVoters;
      independentVotes = myIndependentVoters;
   }
   public VotingMachine(int myRepublicanVotes, int myDemocratVoters) {
      republicanVotes = myRepublicanVotes;
      democratVotes = myDemocratVoters;
      independentVotes = 0;
   }
   //getter method to get the democrat votes
   public int getDemocratVotes() {
      return democratVotes;
   }
   //getter method to get the republican votes
   public int getRepublicanVotes() {
      return republicanVotes;
   
   }
   //getter method to get the independent votes
   public int getIndependentVotes() {
      return independentVotes;
   }
   //setter method that sets the democrat votes
   public void setDemocratVotes(int myDemocratVotes) {
      democratVotes = myDemocratVotes;
   }
   //setter method that sets the republican votes
   public void setRepublicanVotes(int myRepublicanVotes) {
      republicanVotes = myRepublicanVotes;
   }
   //setter method that sets the independent votes
   public void setIndependentVotes(int myIndependentVotes) {
      independentVotes = myIndependentVotes;
   }
   //method to increment the number of democrat votes by 1
   public void voteDemocrat() {
   democratVotes++;
   }
   //method to increment the number of republican votes by 1
   public void voteRepublican() {
      republicanVotes++;
   }
   //method to increment the number of independent votes by 1
   public void voteIndependent() {
      independentVotes++;
   }
   //method to increment the number of democrat votes by the amount passed in the parameter
   public void voteDemocrat(int incrementDecmocratVotes) {
   democratVotes+= incrementDecmocratVotes;
   }
   //method to increment the number of republican votes by the amount passed in the parameter
   public void voteRepublican(int incrementRepublicanVotes) {
      republicanVotes+=incrementRepublicanVotes;
   }
   //method to increment the number of independent votes by the amount passed in the parameter
   public void voteIndependent(int incrementIndependentVotes) {
      independentVotes+=incrementIndependentVotes;
   }
   //method to clear all the votes
   public void clear() {
      democratVotes = 0;
      republicanVotes = 0;
      independentVotes = 0;
   }
   //method to calculate the total votes
   public int totalVotes() {
      int total = democratVotes + republicanVotes + independentVotes;
      return total;
   }
   //method to calculate the percent of democrat votes
   public double percentDemocrat() {
      return ((((double)democratVotes / totalVotes())) * 100.0);
   }
   //method to calculate the percent of republican votes
   public double percentRepublican() {
      return ((((double)republicanVotes / totalVotes())) * 100.0);
   }
   //method to calculate the percent of independent votes
   public double percentIndependent() {
      return (((double)independentVotes / totalVotes()) * 100.0);
   }
   //method to print the stats
   public void printStats() {
      System.out.println("Total votes: " + totalVotes());
      System.out.println("Percent Democrat Votes: " + percentDemocrat());
      System.out.println("Percent Republican Votes: " + percentRepublican());
      System.out.println("Percent Independent Votes: " + percentIndependent());
   }
}