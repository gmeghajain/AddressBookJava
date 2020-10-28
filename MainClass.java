package com.example.AddressBookProb;

public class MainClass {
    public static void main(String [] args){
        int ans=1;
        while(ans == 1){
            AddressBookManager addressBookManager = new AddressBookManager();
            System.out.println("Choose an Option:"+"\n 1.Create new AddressBook"+"\n 2. Open existing Addressbook"+"\n 3. Save Addressbook"+"\n 4. Save as AddressBook"+"\n 5. Close AddressBook");
            int selection=sc.nextInt();
            switch(selection){
                case 1:
                    addressBookManager.newAddressBook();
                    break;
                case 2:
                    addressBookManager.openAddressBook();
                    int input=1;
                    while (input==1){
                        AddressBook addressBook = new AddressBook();
                        System.out.println("Choose an option from menu:"+"\n 1. Add person"+"\n 2. Edit person"+"\n 3.Delete person"+"\n 4.Sort person by LastName"+"\n 5.Sort Person by Zip code"+"\n 6.Search Person"+"\n 7. Display"+"\n 8. Quit");
                        int val=sc.nextInt();
                        switch(val){
                            case 1:
                                addressBook.addPerson();
                                break;
                            case 2:
                                addressBook.editPerson();
                                break;
                            case 3:
                                addressBook.deletePerson();
                                break;
                            case 4:
                                addressBook.sortbyName();
                                break;
                            case 5:
                                addressBook.sortbyZip();
                                break;
                            case 6:
                                addressBook.searchPerson();
                                break;
                            case 7:
                                addressBook.display();
                                break;
                            case 8:
                                input=0;
                                break;
                            default:
                                System.out.println("Invalid choice")
                        }
                    }
                break;
                case 3:
                    addressBookManager.saveAddressBook();
                    break;
                case 4:
                    addressBookManager.saveAsAddressBook();
                case 5:
                    addressBookManager.closeAddressBook();
                    break;
                case 6:
                    ans=0;
                default:
                    System.out.println("Invalid selection");
                    break;

            }
        }
    }
}
