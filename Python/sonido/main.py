# pip install pygame

import pygame

# Initialize pygame mixer
pygame.mixer.init()

# Load the MP3 file
pygame.mixer.music.load("E://Around the World.mp3")

# Play the MP3 file
pygame.mixer.music.play()

#pygame.mixer.music.stop()

# Keep the program running until the music finishes
while pygame.mixer.music.get_busy():
    pygame.time.Clock().tick(10)