Feature: View all the vets

  As a Pet Clinic owner
  I need to be able to see all the vets i employ, along with their specialities
  So that I can know if I need to hire anyone else

  Scenario: View the full list of vets
    Given Peter is a Pet Clinic Owner
    When he views the vets in his clinic
    Then he should see the name of each vet in the clinic