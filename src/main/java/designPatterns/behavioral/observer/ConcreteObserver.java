package designPatterns.behavioral.observer;

// Concrete observer
class ConcreteObserver implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Observer notified: State is " + subject.getState());
    }
}

