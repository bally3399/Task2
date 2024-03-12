package oop2;

public class User {
    private Diary diary = new Diary("username", "password");
    public Diary createDiary(String username, String password){
        diary = new Diary(username, password);
        return diary;
    }

    public void lockDiary(){
        diary.lock();
    }
    public void unlockDiary(String password){
        diary.unLocked(password);
    }

    public void addEntry(String title, String body){
        diary.createEntry(title, body);
    }

    public void deleteEntry(int id){
        diary.deleteEntry(id);
    }

    public Entry findEntryById(int id){
        Entry entry = diary.findEntry(id);
        return entry;
    }
    public void updateEntry(int id, String newTitle, String newBody){
        diary.updateEntry(id, newTitle, newBody);
    }
}
