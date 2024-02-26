//package info.com.swich.examples;
//
//public class SwitchStatement {
//
//    public static void main(String[] args) {
//
//
//        switch (1) {
//            case 1:
//                System.out.println("value 1");
//                break;
//            case 2:
//                System.out.println("value 2");
//                break;
//            case 3:
//                System.out.println("value 3");
//                break;
//        }
//
//
//        switch ("hello") {
//            case "hello" -> System.out.println("Hello");
//            case "hi" -> System.out.println("value 2");
//            case "bye" -> System.out.println("value 3");
//        }
//
//        String month = "Hello";
//        System.out.println("Month: " + month + " Quater of Month: " + getQuater(month));
//
//    }
//
//
//    public static String getQuater(String month) {
//
//
////        switch (month) {
////
////            case "January":
////            case "Febuarary":
////            case "March":
////                return "First Quater";
////            case "April":
////            case "May":
////            case "June":
////                return "Second Quater";
////            case "July":
////            case "August":
////            case "September":
////                return "Third Quater";
////            case "October":
////            case "November":
////            case "December":
////                return "Fourth Quater";
////        }
////        return "bad";
////    }
//
//
//        return switch (month) {
//            case "January", "February", "March" ->   {yield  "First Quarter";}
//            case "April", "May", "June" -> "Second Quarter";
//            case "July", "August", "September" -> "Third Quarter";
//            case "October", "November", "December" -> "Fourth Quarter";
//            default -> {
//                String badResponse = "is Bad";
//                yield badResponse;
//            }
//
////                    "bad";
//        };
//
//    }
//}
