package io.javabrains.springbootstarter.topics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepo;
	
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
		topicRepo.findAll().forEach(topics::add);
		return topics;
	}
	
	public Optional<Topic> getTopic(Integer topicId) {
		//return topics.stream().filter(topic -> topic.getId().equals(topicId)).findFirst().get();
		return topicRepo.findById(topicId);
	}

	public void addTopic(Topic topic) {
		topicRepo.save(topic);
	}

	public void updateTopic(Topic topic, Integer id) {
		/*
		 * for(int i=0;i<topics.size();i++) { if(topics.get(i).getId().equals(id)) {
		 * topics.set(i, topic); return; } }
		 */
		topicRepo.save(topic);
		
	}

	public void deleteTopic(Integer id) {
		//topics.removeIf(topic -> topic.getId().equals(id));
		topicRepo.deleteById(id);
	}

}
