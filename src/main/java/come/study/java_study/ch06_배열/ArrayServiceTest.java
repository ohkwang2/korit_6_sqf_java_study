package come.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayServiceTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택 : ");

            String selectMenu = scanner.nextLine();

            switch (selectMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    newNames = null;    //안 비워줘도 상관은 없음.
                    System.out.println("등록 할 이름: ");
                    names[names.length -1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.println("수정할 이름을 입력하세요.");
                    String modifyName = null;
                    int modifyIndex = 0;
                    String modifyInputName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(modifyInputName)) {
                            System.out.println("이름을 수정 할 수 있습니다.");
                            modifyIndex = i;
                            System.out.println("수정 할 이름을 입력하세요.");
                            modifyName = scanner.nextLine();
//                            System.out.println("수정할 이름 인덱스 : " + modifyIndex);
//                            System.out.println("수정할 이름 : " + modifyName);
                            for(int j = 0; j< names.length; j++) {
                                if(j == modifyIndex) {
                                    names[j] = modifyName;
                                    continue; // continue가 없으면 대체 뒤에 내용 대체 안 하고 끝나버림
                                }
                                names[j] = names[j];
                            }
                            System.out.println("이름 수정 완료");
                            System.out.println("수정전 이름 : " + modifyInputName + ", 수정 후 이름 : " + modifyName);
                            break;
                        }
                    }
                    if(modifyName == null) {
                        System.out.println("일치하는 이름이 없습니다. 다시 검색해주세요.");
                    }
                    System.out.println();
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.println("삭제할 이름을 입력하세요.");
                    String deleteName = null;
                    int deleteIndex = 0;
                    String deleteInputName = scanner.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        if(names[i].equals(deleteInputName)) {
                            System.out.println("이름을 삭제할 수 있습니다.");
                            deleteIndex = i;
                            deleteName = deleteInputName;
                            boolean isRunDelete = true;
                            while(isRunDelete) {
                                System.out.println("이름을 삭제하시려면 'Y'를 아니면 'N'을 눌러주세요.");
                                String deleteConfirm = scanner.nextLine();
                                switch (deleteConfirm) {
                                    case "Y":
                                        String[] deletedNames = new String[names.length-1];
                                        for(int j = 0; j < names.length; j++) {
                                            if(j < deleteIndex) {
                                                deletedNames[j] = names[j];
                                            } else if (j > deleteIndex) {
                                                deletedNames[j-1] = names[j];
                                            }
                                        }
                                        names = deletedNames;
                                        deletedNames = null;
                                        isRunDelete = false;
                                        System.out.println("이름 삭제가 완료되었습니다.");
                                        break;
                                    case "N":
                                        isRunDelete = false;
                                        break;
                                    default:
                                        System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
                                        isRunDelete = true;
                                        break;
                                }
                            }
                        }
                        System.out.println();
                    }
                    if(deleteName == null) {
                        System.out.println("일치하는 이름이 없습니다. 다시 검색해주세요.");
                    }
                    System.out.println();
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.println("조회 할 이름: ");
                    String findResult = null;
                    String findName = scanner.nextLine();
                    for(String name : names) {
                        if(name.equals(findName)) {
                            findResult = name;
                            break;
                        }
                    }
                    if(findResult == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    System.out.println();
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    System.out.println();
                    break;
                case "q":
                    System.out.println("[프로그램 종료]");
                    isRun = false;
                    break;
                default :
                    System.out.println("다시 입력하시기 바랍니다.");
                    break;
            }

        }
    }

}
