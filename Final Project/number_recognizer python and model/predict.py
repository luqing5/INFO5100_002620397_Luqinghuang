import sys
import os
import tensorflow as tf
from tensorflow import keras
import numpy as np
from PIL import Image
import matplotlib.pyplot as plt
import numpy as np

# load model
model = keras.models.load_model('handwriting_model')

# read image
if len(sys.argv) < 3:
    print('Usage: python predict.py image_path output_file')
    sys.exit(0)

image_path = sys.argv[1]
output_file = sys.argv[2]

image = Image.open(image_path).convert('L').resize((28, 28))
image = 255 - np.array(image)


# plt.imshow(image, cmap=plt.cm.binary)
# plt.show()

image_array = np.array(image).reshape(1, 28, 28, 1) / 255.0

# predict
predictions = model.predict(image_array, verbose=0)
predicted_label = np.argmax(predictions[0])

if os.path.exists(output_file):
    os.remove(output_file)

# save output to file
with open(output_file, 'w') as f:
    f.write(str(predicted_label))

# print output
print(predicted_label)
